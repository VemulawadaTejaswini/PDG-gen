import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i=0,j=0,count=0,d,sum=0,s=0;
            String a;
            char c;
            int b[];
            b = new int[100000];
                Scanner n = new Scanner(System.in);
                while(true){
                     a = n.nextLine();
                     sum = 0;
                     for(i=0;i<a.length();i++){
                         c = a.charAt(i);
                         d = Character.getNumericValue(c);
                         if(d==0 && (a.length())==1){
                             s=1;
                             break;
                         }
                         sum = sum + d;
                     }
                     if(s==1){
                         break;
                     }
                     b[j] = sum; 
                     count++;
                     j++;
                }
                i=0;
                while(count>i){
                     System.out.println(b[i]);
                     i++;
                }
        }
    }
