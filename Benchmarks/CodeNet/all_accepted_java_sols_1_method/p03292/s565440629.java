import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int max =0;
        int min = 101;
        for(int i=0;i<3;i++){
            int task = scn.nextInt();
            max= Math.max(task,max);
            min=Math.min(task,min);
        }
        System.out.println(max-min);
    }
}
