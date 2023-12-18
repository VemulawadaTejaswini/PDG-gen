import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);



    while(true){
    int n = sc.nextInt();
    if(n==0){
        break;
    }
    int sum=0;
    int ave;
    int[] score;
    score =new int[n];

    

    for(int i=0;i<score.length;i++){
        score[i]=sc.nextInt();
    }

    Arrays.sort(score);

    for(int i=1;i<score.length-1;i++){
        sum =sum+score[i];
    }

    ave=sum/(score.length-2);

    System.out.printf("%d\n",ave);



}

sc.close();
}

}
