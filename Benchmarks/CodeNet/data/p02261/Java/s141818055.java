import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] bubble = new String[n];
		String[] select = new String[n];
		String[] confirm=new String[n];
		for (int i = 0; i < n; i++) {
			String str = st.nextToken();
			bubble[i] = str;
			select[i] = str;
			
			
		}
		boolean con=true;
		bubblesort(bubble);
		selectsort(select);
		StringBuilder stb1 = new StringBuilder(bubble[0]);
		StringBuilder stb2 = new StringBuilder(select[0]);
		boolean con1=sortconfirm(confirm, bubble);
		boolean con2=sortconfirm(confirm,select);
		
		System.out.println(stb1+"\r\n"+(con?"Stable":"Not stable"));			
		System.out.println(stb2+"\r\n"+(con?"Stable":"Not stable"));

	}

	static void bubblesort(String[] in) {
		for (int i = in.length; i > 0; i--) {
			for (int j = 1; j < i; j++) {

				if (in[j - 1].charAt(1) > in[j].charAt(1)) {
					
					String tmp = in[j - 1];
					in[j - 1] = in[j];
					in[j] = tmp;
				}
			}
		}
		
	}

	static void selectsort(String[] in) {
		
		for(int i=0;i<in.length-1;i++){
			int mini=i;
			for(int j=i+1;j<in.length;j++){
				if(in[mini].charAt(1)>in[j].charAt(1)){
					mini=j;
				}
			}
			if(mini!=i){
			String tmp=in[i];
			in[i]=in[mini];
			in[mini]=tmp;}
		}}
	static boolean sortconfirm(String[] input,String[] sorted){
		StringBuilder[] comp1=new StringBuilder[9];
		StringBuilder[] comp2=new StringBuilder[9];
for(int i=0;i<9;i++){
			comp1[i]=new StringBuilder();
			comp2[i]=new StringBuilder();}
		for(int i=0;i<input.length;i++){
			char s=input[i].charAt(1);
			comp1[Integer.parseInt(Character.toString(s))-1].append(input[i].charAt(0));
			char t=sorted[i].charAt(1);
			comp1[Integer.parseInt(Character.toString(t))-1].append(sorted[i].charAt(0));
		}
		boolean con=true;
		for(int i=0;i<9;i++){
			if(comp1[i].toString().equals(comp2[i].toString()))continue;
			else con=false;break;
		}
		return con;
	}
}