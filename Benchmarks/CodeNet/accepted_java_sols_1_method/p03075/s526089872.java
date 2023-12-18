import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] ant = new int[5];
        int k;
        boolean judge =true;
        int A = 0;

        for(int i = 0;i < ant.length;i++){
            ant[i] = sc.nextInt();
        }

        k = sc.nextInt();

        for(int i = 0;i < ant.length;i++){
            for(int j = i+1;j < ant.length;j++){
                A = ant[j] - ant[i];
                if(k < A)
                    judge = false;
            }
        }

        if(judge == false){
            System.out.println(":(");
        }else
            System.out.println("Yay!");

    }
}