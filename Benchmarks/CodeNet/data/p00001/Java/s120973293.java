import java.util.Scanner;
class Main{
	    public static void main(String[] args){
    	int mountain[]=new int[10];
    	int su=0;
Scanner sc = new Scanner(System.in);
for(int i=1;i<=10;i++){
	mountain[i]=sc.nextInt();
	
}
int max = mountain[1];
int big[]=new int[3];
	for(int j=1;j<=3;j++){
	for(int i=1;i<=10;i++){
		if(mountain[i]>max){
			max=mountain[i];
		}
	}
	big[j]=max;
}
	for(int i=1;i<=3;i++){
		System.out.println(big[i]);
	}


    }
}