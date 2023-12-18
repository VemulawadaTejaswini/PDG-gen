import java.util.Scanner;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,j,k;
	while(true) {
	    i = sc.nextInt();
	    j = sc.nextInt();
	    if(i == 0 && j == 0) break;
	    else if(i>j){
		k=i;i=j;j=k;
	    }
	    System.out.println(i+" "+j);
	}
    }
}