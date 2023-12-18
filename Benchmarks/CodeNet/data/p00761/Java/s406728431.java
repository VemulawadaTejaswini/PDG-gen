import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kazuki on 2014/06/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numArray,renumArray;
        int[] a = new int[21];
        int num,renum,tmp,L;
        boolean flag;
        int i;

        while(true){
            a[0] = s.nextInt();
            L = s.nextInt();
            if(a[0]==0 && L==0) break;

            numArray = new int[L];
            renumArray = new int[L];
            i=0;
            flag = true;
            while(flag){
                tmp=a[i];
                for(int n=0;n<L;n++){
                    numArray[n]=tmp%10;
                    tmp=tmp/10;
                }

                Arrays.sort(numArray);
                for(int n=0;n<L;n++)
                    renumArray[n]=numArray[L-1-n];

                num=0;
                renum=0;
                for(int n=0;n<L;n++){
                    num+=numArray[n]*Math.pow(10,n);
                    renum+=renumArray[n]*Math.pow(10,n);
                }

                a[++i]=num-renum;

                for(int j=0;j<i;j++){
                    if(a[i]==a[j]){
                        System.out.println(j+" "+a[i]+" "+(i-j));
                        flag=false;
                    }
                }
            }


        }

    }
}