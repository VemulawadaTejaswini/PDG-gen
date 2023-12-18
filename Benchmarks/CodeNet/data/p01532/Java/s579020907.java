import java.util.Scanner;

class Aizu{
	int t;
	int h;
	
	Aizu(int t,int h){
		this.t=t;
		this.h=h;
	}
}

public class Main {

	public static void main(String[] args) {
		new Main().run();
		//new AOJ2418().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);

		while(sc.hasNext()){
			int N=sc.nextInt();
			int T=sc.nextInt();
			int H=sc.nextInt();
			int L=sc.nextInt();
			int zankin=0;

			Aizu a[]=new Aizu[N];

			for(int i=0;i<N;i++){
				a[i]=new Aizu(sc.nextInt(), sc.nextInt());
			}

			for(int i=0;;i++){
				boolean flag=false;
				//0
				if(a[i%N].t+a[i%N].h==0){
					//i is winner
					System.out.println((i%N)+1);
					break;
				}
				//1
				if(a[i%N].t!=0){
					a[i%N].t--;
					T++;
					if(L<T){
						//i is winner
						System.out.println((i%N)+1);
						break;
					}
					zankin+=10;
				}
				else{
					a[i%N].h--;
					H++;
					zankin+=100;
				}
				//2
				if(90<=zankin){
					//3
					int otsuri=zankin-90;
					zankin=0;
					while(true){
						if(otsuri<=T*10){
							//10円で払える
							T-=otsuri/10;
							a[i%N].t+=otsuri/10;
							break;
						}
						else if(H!=0 && 100<=otsuri){
							H--;
							otsuri-=100;
							a[i%N].h++;
						}
						else{
							//destroy!i is winner
							flag=true;
							break;
						}
					}
				}
				if(flag){
					System.out.println((i%N)+1);
					break;
				}
			}
		}
	}

}