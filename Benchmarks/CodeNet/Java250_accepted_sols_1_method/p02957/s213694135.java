import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int answer=0;
        int max =Math.max(a,b);
        int min = Math.min(a,b);
        for(int i=0;;i++){
            if(max<=0&&min<=0||(a+b)%2==1){
                System.out.println("IMPOSSIBLE");
                break;
            }
            if(Math.abs(max)==Math.abs(min)){
                System.out.println(answer);
                break;
            }
            max--;
            min--;
            answer++;
        }
    }
}
