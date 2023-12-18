import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
        int b = 0;
        int c;
        int [][] in = new int [10][10];
        for(int i=1;i<=a;i++){if(i<10){c=i;}else{if(i<100){c=i/10;}
                                                else{if(i<1000){c=i/100;}
                                                    else{if(i<10000){c=i/1000;}
                                                        else{if(i<100000){c=i/10000;}
                                                            else{c=i/100000;}}}}}                                     
        in[c][i%10]++;}
        for(int i=0;i<=9;i++){
        for(int j=0;j<=9;j++){b+=in[i][j]*in[j][i];}}
		System.out.println(b);
	}
}
