import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    int score1[] = new int[100];
    int i =0, max=0, min=1000, sum =0;
try(Scanner sc =new Scanner(System.in)){
    while(true){
 int score = sc.nextInt();
 if(score==0) { break; }
 score1[i]=score;
 sum=sum+score1[i];
 i++;
    }

for(int j=0;j<i;j++){
    if(max>score1[j]){
        if(min>score1[j]) min=score1[j];       
    }else max=score1[j];
}
sum=sum-max-min;
System.out.println(sum/(i-2));

}
}
}
