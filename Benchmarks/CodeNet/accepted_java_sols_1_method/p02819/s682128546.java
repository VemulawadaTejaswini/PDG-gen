import java.util.*;
import java.lang.Math;


class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==2){
            System.out.println(2);
        }
        else{
            if(n%2==0){
                n+=1;
            }
            int f=0;
            while(f==0){
                int k= (int) Math.ceil(Math.sqrt(n));
                int l=0;
                for(int i=2;i<k;i++){
                    if(n%i==0){
                        break;
                    }
                    else{
                        l+=1;
                    }
                

                }
                if(l==k-2){
                    f=1;
                    System.out.println(n);
                }
                else{
                    n+=2;
                }



            }


        }
        }
    

    }
