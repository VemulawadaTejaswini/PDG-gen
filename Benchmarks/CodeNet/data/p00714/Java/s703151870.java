import java.util.*;

class Sikiri{
    int x, y;
    final int defx, defy;
    double inwater = 0;
    boolean ismax = false;
    Sikiri(int x, int y){
        this.x = x;
        this.defx = x;
        this.y = y;
        this.defy = y;
    }
}

class Zyaguti{
    int x, ryou, position;
    static int allryou=0, finish=0;
    Zyaguti(int x, int ryou){
        this.x = x;
        this.ryou = ryou;
        allryou += ryou;
    }
}

class Sokutei{
    int x, time, position;
    Sokutei(int x, int time){
        this.x = x;
        this.time = time;
    }
}

public class Main{
    static final Scanner sc = new Scanner(System.in);
    static int width = 100;
    static int height = 50;
    static int depth = 30;

    static int SumOfWater(Sikiri[] sikiri, Zyaguti zyaguti, Sokutei sokutei){
        int maxwater = 0, amari = 0, j = zyaguti.position;
        int sum = zyaguti.ryou*sokutei.time;
        int tempwidth = sikiri[j].x - sikiri[j-1].x;
        maxwater = tempwidth*depth*Math.min(sikiri[j-1].y, sikiri[j].y);
        maxwater -= sikiri[j].inwater;
        if(sum > maxwater){
            amari = sum - maxwater;
            sikiri[j].inwater += maxwater;
            sikiri[j].ismax = true;
        }else{
            sikiri[j].inwater += sum;
        }
        return amari;
    }
    
    static void addWater(int amari, Sikiri[] sikiri, int j){
        if(j > 0 && sikiri[j].ismax && sikiri[j-1].ismax && sikiri[j-1].y < sikiri[j].y){
            sikiri[j].inwater += sikiri[j-1].inwater;
            for(int i=j-1;i>0;i--){
            sikiri[i].x = sikiri[i-1].x;
            sikiri[i].y = sikiri[i-1].y;
            sikiri[i].inwater = sikiri[i-1].inwater;
            sikiri[i].ismax = sikiri[i-1].ismax;
            }
            sikiri[j].ismax = false;
        }
        int maxwater = 0, tempwidth = 0;
        if(sikiri[j].ismax){
            if(sikiri[j].y > sikiri[j-1].y){
                tempwidth = sikiri[j-1].x - sikiri[j-2].x;
                maxwater = tempwidth*depth*Math.min(sikiri[j-2].y, sikiri[j-1].y);
                maxwater -= sikiri[j-1].inwater;
                if(maxwater > amari){
                    sikiri[j-1].inwater += amari;
                    amari = 0;
                }else{
                    sikiri[j-1].inwater += maxwater;
                    sikiri[j-1].ismax = true;
                    amari  -= maxwater;
                }
            }else{
                tempwidth = sikiri[j+1].x - sikiri[j].x;
                maxwater = tempwidth*depth*Math.min(sikiri[j].y,sikiri[j+1].y);
                maxwater -= sikiri[j+1].inwater;
                if(maxwater > amari){
                    sikiri[j+1].inwater += amari;
                    amari = 0;
                }else{
                    sikiri[j+1].inwater += maxwater;
                    sikiri[j+1].ismax = true;
                    amari  -= maxwater;
                    j += 1;
                }
            }
        }else{
            tempwidth = sikiri[j].x - sikiri[j-1].x;
            maxwater = tempwidth*depth*Math.min(sikiri[j].y, sikiri[j-1].y);
            maxwater -= sikiri[j].inwater;
            if(amari > maxwater){
                amari = amari - maxwater;
                sikiri[j].inwater += maxwater;
                sikiri[j].ismax = true;
            }else{
                sikiri[j].inwater += amari;
                amari = 0;
            }
        }
        if(amari > 0) addWater(amari, sikiri, j);
    }

    static double Searchheight(Sikiri[] sikiri, int j){
        int tempwidth = sikiri[j].x - sikiri[j-1].x;
        double tempheight = sikiri[j].inwater/(tempwidth*depth);
        return tempheight;
    }

    public static void solve(){
        int amari=0;
        //data of sikiri
        int N = sc.nextInt();
        Sikiri[] sikiri = new Sikiri[N+2];
        sikiri[0] = new Sikiri(0, height); // leftside
        sikiri[N+1] = new Sikiri(width, height); // rightside
        for(int i=1;i<=N;i++) sikiri[i] = new Sikiri(sc.nextInt(), sc.nextInt());
        //data of zyaguti & sikiri next to zyaguti
        int M = sc.nextInt();
        Zyaguti[] zyaguti = new Zyaguti[M];
        for(int i=0;i<M;i++) zyaguti[i] = new Zyaguti(sc.nextInt(), sc.nextInt());
        for(int i=0;i<M;i++){
            for(int j=1;j<=N+2;j++){
                if(zyaguti[i].x > sikiri[j].x) continue;
                zyaguti[i].position = j;
                break;
            }
        }
        for(int i=0;i<M;i++){
            for(int j=i+1;j<M;j++){
                if(zyaguti[i].position == zyaguti[j].position){
                    zyaguti[i].ryou += zyaguti[j].ryou;
                    zyaguti[j].ryou = 0;
                    zyaguti[j].position = N+1;
                }
            }
        }
        Zyaguti.finish = width*height*depth/Zyaguti.allryou;
        //data of sokutei
        int L = sc.nextInt();
        Sokutei[] sokutei = new Sokutei[L];
        for(int i=0;i<L;i++) sokutei[i] = new Sokutei(sc.nextInt(), sc.nextInt());
        //sokutei
        for(int i=0;i<L;i++){
            if(sokutei[i].time >= Zyaguti.finish){
                double d = 50;
                System.out.println(d);
                continue;
            }
            for(int j=0;j<M;j++){
                amari = SumOfWater(sikiri, zyaguti[j], sokutei[i]);
                if(amari == 0) continue;
                addWater(amari, sikiri, zyaguti[j].position);
            }
            for(int p=0;p<L;p++){
                for(int q=0;q<N+2;q++){
                    if(sokutei[p].x > sikiri[q].x) continue;
                    sokutei[p].position = q;
                    break;
                }
            }
            double tempheight = Searchheight(sikiri, sokutei[i].position);
            System.out.println(tempheight);
            for(int k=0;k<N+2;k++){
                sikiri[k].inwater = 0;
                sikiri[k].ismax = false;
                sikiri[k].x = sikiri[k].defx;
                sikiri[k].y = sikiri[k].defy;
            }
        }
    }

    public static void main(String[] args){
        int D = sc.nextInt();
        for(int i=0;i<D;i++){
            solve();
        }
    }
}
