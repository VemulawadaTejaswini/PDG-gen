import java.util.Scanner;
class Main{
	Scanner sc=new Scanner(System.in);
	int w;
	int t;
	int a=4280;
	void a(){
		while(true){
		w=sc.nextInt();
		if(w==-1){
			break;
		}
		 if(w<=10){
		 	t=1150;
		 }else if(w<=20){
		 	t=1150+(w-10)*125;
		 }else if(w<=30){
		 	t=1150+10*125+(w-20)*140;
		 }else{
		 	t=1150+10*125+10*140+(w-30)*160; 
		 }
		 
		 t=4280-t;
		 System.out.println(t);
		}
	}
	public static void main(String[]agrs){
		new Main().a();
	}
}