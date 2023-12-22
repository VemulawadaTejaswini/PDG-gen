import java.util.Scanner;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (true){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i,j,k,l;
	k =0;
    if (a==0 && b==0){
        break;
        }
    for(i=0;i<a; i++){
        for(j=0;j<b;k++){
            System.out.printf("#");
			j = j+1;
			if(j==b){
			break;
			}else{
			System.out.printf(".");
			j = j+1;
            }
			}
        System.out.printf("\n");
		i=i+1;
		if(i==a){
		break;
		}else{
		for(l=0;l<b;k++){
		System.out.printf(".");
			l = l+1;
			if(l==b){
			break;
			}else{
			System.out.printf("#");
			l = l+1;
            }
    }
    System.out.printf("\n");
    }}
	System.out.printf("\n");
}
}}