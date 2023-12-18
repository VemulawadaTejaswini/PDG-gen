import java.util.Scanner;

public class Main{
public static main(String[] args){
Scanner sc = new Scanner(System.in);
int min = 10000000000;
int profit = -1000000000;
int maxP = -1000000000;
int n = sc.nextInt();
for(int i = 0;i<n;I++){
int val = sc.nextInt();
profit = val - min;
if(profit > maxP){
 maxP = profit;
} 
if(val < min){
 min = val; 
}
 }
}
}
