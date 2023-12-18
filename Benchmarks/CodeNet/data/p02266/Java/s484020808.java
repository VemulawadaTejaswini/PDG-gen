import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String po=s.nextLine();
        char a[]=po.toCharArray();
        int high[]=new int[20001];
        int mizu[]=new int[10001];
        int i=0;
        for(char a1 : a){
            i++;
            if(a1=='/') high[i]=high[i-1]+1;
            else if(a1=='_') high[i]=high[i-1];
            else high[i]=high[i-1]-1;
        }
        int j=0,tmp=0,cnt=0;
        while(j<i){
            if(high[j]>high[j+1]){
                int m=j;
                while(m<i){
                    m++;
                    if(high[j]==high[m]){
                        mizu[cnt]=menseki(high,j,m);
                        tmp+=mizu[cnt];
                        cnt++;
                        j=m-1;
                        break;
                    }
                }
            }
            j++;
        }
        System.out.println(tmp);
        System.out.print(cnt);
        for(i=0;i<cnt;i++){
            System.out.print(" "+mizu[i]);
        }
        System.out.println("");

    }
    public static int menseki(int[] high,int first,int last){
        int s=0;
        for(int i=first;i<last;i++){
            if(high[i]>high[i+1]){
                s+=((high[first]-high[i+1])*2-1);
            }else if(high[i]==high[i+1]){
                s+=(high[first]-high[i])*2;
            }else{
                s+=((high[first]-high[i])*2-1);
            }
        }
        return s/2;
    }
}
