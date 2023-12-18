import java.util.Scanner;


public class Main {

	void io(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []histgram=new int[6];
		for(int i=0;i<n;++i){
			double height=s.nextDouble();
			if(height<165.0){
				++histgram[0];
			}
			else if(height<170.0){
				++histgram[1];
			}
			else if(height<175.0){
				++histgram[2];
			}
			else if(height<180.0){
				++histgram[3];
			}
			else if(height<185.0){
				++histgram[4];
			}
			else{
				++histgram[5];
			}
		}
		for(int i=0;i<6;++i){
			System.out.print((i+1)+":");
			for(int k=0;k<histgram[i];++k){
				System.out.print('*');
			}
			System.out.println();
		}
		s.close();
	}
	
	public static void main(String[] args) {
		new Main().io();
	}

}