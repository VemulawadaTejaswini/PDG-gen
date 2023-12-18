import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner std = new Scanner(System.in);
        int defaultpip[] = new int[6];
 
        for(int i=0; i<6; i++){
            defaultpip[i] = Integer.parseInt(std.next());
        }
        Dice dc1 = new Dice(defaultpip);
 
        int defaultpip2[] = new int[6];
        for(int i=0; i<6; i++){
            defaultpip2[i] = Integer.parseInt(std.next());
        }
        Dice dc2 = new Dice(defaultpip2);

        String query[] = {"S", "W", "N", "E"};
 
        boolean same = false;
        for(int i = 0; i<1000; i++){
            if(dc1.issame(dc2)){
                same = true; break;
            }else{
                dc1 = dc1.newnowpips(query[(int)(Math.random()*4)]);
            }
        }
        if(same){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
 
class Dice {
    int pips[];
    int nowpip;
    int spip;
    int epip;
    int wpip;
    int npip;
    int rpip;
 
    public Dice(int pip[]){
        this(pip, 0, 1, 2, 3, 4, 5);
    }
 
    public Dice(int pip[], int now, int s, int e, int w, int n, int r){
        pips = pip;
        nowpip = now;
        spip = s;
        epip = e;
        wpip = w;
        npip = n;
        rpip = r;
    }
 
    public Dice newnowpips(String query){
        if(query.equals("N")){
            return new Dice(pips,spip,rpip,epip,wpip,nowpip,npip);
        }else if(query.equals("E")){
            return new Dice(pips,wpip,spip,nowpip,rpip,npip,epip);
        }else if(query.equals("S")){
            return new Dice(pips,npip,nowpip,epip,wpip,rpip,spip);
        }else if(query.equals("W")){
            return new Dice(pips,epip,spip,rpip,nowpip,npip,wpip);
        }else { //clockwise
            return new Dice(pips,nowpip,epip,npip,wpip,spip,rpip);
        }
    }
 
    public String showdice(){
        return pips[nowpip] +" "+ pips[spip] +" "+ pips[epip] +" "+ pips[wpip] +" "+ pips[npip] +" "+ pips[rpip];
    }
 
    public boolean issame(Dice d2){
        return showdice().equals(d2.showdice());
    }
}
