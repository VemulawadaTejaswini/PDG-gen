import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			while(N!=0){
				String[] map = new String[N];
				for(int i=0;i<N;i++) map[i]=new String(sc.next());
				int answer=0;
				for(int size=1;size<=N;size++){
					int pos=N-size+1;
					StringBuilder milestone=new StringBuilder();
					for(int i=0;i<size;i++)milestone.append(".");
					int[] checkColumn=new int[pos];
					for(int i=0;i<pos;i++)checkColumn[i]=0;
					
					for(int C=0;C<N;C++){
						for(int R=0;R<pos;R++){
							if(map[C].substring(R,R+size).equals(milestone.toString())){
								checkColumn[R]++;
							}else{
								checkColumn[R]=0;
							}
							if(checkColumn[R]==size)answer=size;
						}							
					}
				}
				System.out.println(answer);
				N = Integer.parseInt(sc.next());
			}
		}
	}
}