import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long max =0;
        ArrayList<Integer> monster = new ArrayList<>();
        ArrayList<Integer> player = new ArrayList<>();
        for(int i=0;i<N+1;i++) monster.add(sc.nextInt());
        for(int i=0;i<N;i++) player.add(sc.nextInt());
        for(int i=0;i<N;i++){
            int num1 = monster.get(i);
            int num2 = monster.get(i+1);
            int num3 = player.get(i);
            if(num1-num3>=0){
                max+=num3;
                monster.set(i,num1-num3);
            }
            else if(num1-num3<0) {
                max+=num1;
                num3-=num1;
                monster.set(i,0);
                if(num2-num3>=0){
                    max+=num3;
                    monster.set(i+1,num2-num3);
                }
                else if(num2-num3<0) {
                    max+=num2;
                    monster.set(i+1,0);
                }
            }
        }
        System.out.println(max);
    }
}