import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
double average = 0, variance = 0;
int n = sc.nextInt();
if(n==0) {break;}
int[] scores = new int[n];
for(int i=0;i<scores.length;i++){
scores[i]=sc.nextInt();
average += scores[i];
}
average = average / scores.length;
for (int j=0;j<scores.length;j++){
variance += scores[j] * scores[j] - average * average;
}

System.out.println(Math.sqrt(variance/scores.length));
}
}
}
