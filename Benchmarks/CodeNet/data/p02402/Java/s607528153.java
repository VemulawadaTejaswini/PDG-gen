import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ai=sc.nextInt();
        int max,min;
        long sum=ai;
        max=min=ai;
        for(int i=1;i<n;i++){
            ai=sc.nextInt();
            if(max<ai){
                max=ai;
            }else if(min>ai){
                min=ai;
            }
            sum+=ai;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}
