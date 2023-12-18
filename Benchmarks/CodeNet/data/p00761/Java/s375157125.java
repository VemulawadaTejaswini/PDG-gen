import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kazuki on 2014/06/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numArray,renumArray;
        int[] a = new int[20];
        int num,renum,tmp;
        boolean flag;
        int j;

        while(true){
            a[0] = s.nextInt();
            int L = s.nextInt();
            if(a[0]==0 && L==0) break;

            numArray = new int[L];
            renumArray = new int[L];
            j=0;
            flag = true;
            while(flag){
                tmp=a[j];
                for(int i=0;i<L;i++){
                    numArray[i]=tmp%10;
                    tmp=tmp/10;
//            if(a==0) break;
                }

                Arrays.sort(numArray);
                for(int i=0;i<L;i++)
                    renumArray[i]=numArray[L-1-i];

                num=0;
                renum=0;
                for(int i=0;i<L;i++){
                    num+=numArray[i]*Math.pow(10,i);
                    renum+=renumArray[i]*Math.pow(10,i);
                }

                a[++j]=num-renum;

                for(int i=0;i<j;i++){
                    if(a[j]==a[i]){
                        System.out.println(i+" "+a[j]+" "+(j-i));
                        flag=false;
                    }
                }
            }


        }

    }
}