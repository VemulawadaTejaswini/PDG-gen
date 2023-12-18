import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
for(int i = 0; ; i++){
int m = sc.nextInt();
int f = sc.nextInt();
int r = sc.nextInt();
int j;
int k;
k = m+f;

if(m==-1 && f==-1 && r==-1){break;}

if(m==-1 || f==-1){System.out.println("F");}
else if (k>=80){System.out.println("A");}
	else if(k >=65 && k <80){System.out.println("B");}
	else if(k >=50 && k <65){System.out.println("C");}
	else if(k >=30 && k <50){
		if(r>=50){System.out.println("C");}else{System.out.println("D");}}
	else{System.out.println("F");}
	


}
}}