import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt();
        int sum = 0;

        if(x==1) {
            sum += 300000;
        } else if(x==2){
            sum += 200000;
        } else if(x==3){
            sum += 100000;
        }

        if(y==1) {
            sum += 300000;
        } else if(y==2){
            sum += 200000;
        } else if(y==3){
            sum += 100000;
        }

        if(x==1 && y==1) {
            sum += 400000;
        }

        System.out.println(sum);

    }
}