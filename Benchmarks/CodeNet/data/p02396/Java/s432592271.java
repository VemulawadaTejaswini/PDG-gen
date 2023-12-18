import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int a[];
            int i=1,count=1;
            a = new int[10000];
            a[1]=1;
                Scanner num = new Scanner(System.in);
                while(true){
                     a[i] = num.nextInt();
                     if(a[i]!=0){
                         i+=1;
                         count+=1;
                     }else{
                         break;
                     }
                }
                i=1;
                while(count>i){
                    System.out.println("Case " + i + ": " + a[i]);
                    i++;
                }
        }
    }
