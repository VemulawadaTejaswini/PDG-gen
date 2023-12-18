import java.util.*;

class Main{
    public static void main(String args[]){
        int n,x,y,count=0;
        double d;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        d=sc.nextDouble();
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            double d_i=Math.sqrt((x*x)+(y*y));
            //System.out.printf("d=%f , d_i=%f\n",d,d_i);   
            if(Double.isNaN(d_i)){
                System.out.println("NAN");
            }else{ 
                if(d>=d_i){
                    //System.out.print("Plus");
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }

}