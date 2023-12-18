import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// ???????????°??????????????¨??£??????????°???????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] line= str.split(" ");

		int a=Integer.parseInt(line[0]);
		int b=Integer.parseInt(line[1]);
		int c=Integer.parseInt(line[2]);

		int Max1,Max2;

		if(a>b){
			Max1=a;
			Max2=b;
		}else{
			Max1=b;
			Max2=a;
		}

		int Max=0,Mid=0,Min=0;

		if(Max1>c && Max2>c){
			Max=Max1;
			Mid=Max2;
			Min=c;
		}else if(Max1>=c && c>=Max2){
			Max=Max1;
			Mid=c;
			Min=Max2;
		}else if(Max1<c && Max2<c){
			Max=c;
			Mid=Max1;
			Min=Max2;
		}

		System.out.println(Max+" "+Mid+" "+Min);

	}

}