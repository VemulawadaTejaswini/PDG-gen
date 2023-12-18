import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		Dice2 dice=new Dice2();
		for(int i=0;i<6;i++){
			dice.set(sc.nextInt(),i);
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int u=sc.nextInt();
			int f=sc.nextInt();
			System.out.println(dice.find(u,f));
		}
	}

}
class Dice2 {
	private int d[]=new int[6];
	void set(int a,int i){
			d[i]=a;
	}
	int get(int i){
		return d[i-1];
	}
	int find(int u,int f){
		for(int i=0;i<6;i++){
			if(d[i]==u)u=i+1;
			if(d[i]==f)f=i+1;
		}
		if(u==1){
			if(f==2)return get(3);
			if(f==3)return get(5);
			if(f==5)return get(4);
			if(f==4)return get(2);
		}
		if(u==2){
			if(f==1)return get(4);
			if(f==4)return get(6);
			if(f==6)return get(3);
			if(f==3)return get(1);
		}
		if(u==3){
			if(f==1)return get(2);
			if(f==2)return get(6);
			if(f==6)return get(5);
			if(f==5)return get(1);
		}
		if(u==4){
			if(f==1)return get(5);
			if(f==2)return get(1);
			if(f==6)return get(2);
			if(f==5)return get(6);
		}
		if(u==5){
			if(f==1)return get(3);
			if(f==3)return get(6);
			if(f==6)return get(4);
			if(f==4)return get(1);
		}
		else{
			if(f==2)return get(4);
			if(f==3)return get(2);
			if(f==5)return get(3);
			if(f==4)return get(5);
		}
	}