import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int max=-1000001,min=1000001;
        long sum=0;
        int x;
        while(n--!=0){
            x=scan.nextInt();
            if(x>max)max=x;
            if(x<min)min=x;
            sum+=x;
        }
        System.out.println(min+" "+max+" "+sum);
   }
}
