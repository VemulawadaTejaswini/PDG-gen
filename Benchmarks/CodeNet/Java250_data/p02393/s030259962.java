import java.util.Scanner;
class Main{

	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num[]=new int[3];
int tai;


for(int i=0;i<3;i++){
	num[i]=sc.nextInt();
}

for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		if(num[i]>num[j]){
			tai=num[i];
			num[i]=num[j];
			num[j]=tai;
			
		}
	}
}

System.out.println(num[2]+" "+num[1]+" "+num[0]);


}
}
    