import java.util.*;

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a,b,c;
            int count;
            
            while(true){
                int x = sc.nextInt();
                int n = sc.nextInt();
                if(n==0 && x==0){
                    break;
                }
                count=0;
                for(a=1;a<=x;a++){
                   
                    for(b=1;b<a;b++){
                        for(c=1;c<b;c++){
                            if(a+b+c==n){
                        count++;
                            }
                            
                        }
                    }
                }
                    System.out.println(count);
            
        }
        }
    }
