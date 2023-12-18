import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Main {


	static int N;
	static ArrayList<Integer> answer = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		StringTokenizer st=new StringTokenizer(string);
		N=Integer.parseInt(st.nextToken());
		String[] command = new String[N];
		int[] number = new int[N];
		
		//nameとtimesの読み取り
		for(int i=0;i<N;i++){
			string=br.readLine();
			st=new StringTokenizer(string, " ");
			command[i]=st.nextToken();
			if(st.hasMoreTokens()){
			number[i] = (Integer.parseInt(st.nextToken()));
			}else{
			}
		}	
		doMethod(command,number);
	}
	public static void doMethod(String[] command,int[] number) {
		for(int i=0;i<N;i++){
			if(command[i].equals("insert")){
				insert(number[i]);
			}
			if(command[i].equals("delete")){
				delete(number[i]);
			}
			if(command[i].equals("deleteFirst")){
				deleteFirst();
			}
			if(command[i].equals("deleteLast")){
				deleteLast();
			}
		}
		getAnswer();
	}
	
	public static void getAnswer(){
		//今は順序は逆になってる
		if(answer.size()==0){
		}else{
			for(int i= answer.size()-1;i>0;i--){
			System.out.print(answer.get(i)+" ");
			}
			System.out.println(answer.get(0));
		}
	}	
	public static void insert(int number){
		answer.add(number);
	}
	
	public static void delete(int number){
		int index = answer.lastIndexOf(number);
		answer.remove(index);
	}
	
	public static void deleteFirst(){
		int index = answer.size();
		answer.remove(index-1);
	}
	
	public static void deleteLast(){
		answer.remove(0);
		//何もinsertされてないときは本来はメッセージを表示させるべき
	}
	
}