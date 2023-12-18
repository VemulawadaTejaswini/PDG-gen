import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                int n = sc.nextInt();
                if(n==0){break;}
                int max=0,min=0,fscore=0;
                int[] score = new int[n];

                for (int i = 0; i < n; i++) {
                    score[i] = sc.nextInt();
                }


                for(int i =0; i<n;i++){

                    if (score[max]<score[i]){
                        max=i;
                    }
                    if (score[min]>score[i]){
                        min=i;
                    }
                }
                for(int i=0;i<n;i++){
                    fscore += score[i];
                }

                fscore = (fscore-(score[max]+score[min]))/(n-2);
                System.out.println(fscore);
            }
        }
    }
}

