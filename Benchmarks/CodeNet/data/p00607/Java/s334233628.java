import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	static int l, c;
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			ArrayList<StringBuilder> str_array = new ArrayList<StringBuilder>();
			while(true){
			while(true){
				String str = br.readLine();
				if(str.equals("END_OF_TEXT")) break;
				str_array.add(new StringBuilder(str));
			}
			l = 0;
			c = 0;

			String buffer = new String();
			boolean flag = true;
			while(flag){
				char command = br.readLine().charAt(0);

				switch(command){
				case 'a':
					c = 0;
					break;
				case 'e':
					c = str_array.get(l).length();
					break;
				case 'p':
					if(l != 0) l--;
					c = 0;
					break;
				case 'n':
					if(l != str_array.size() - 1) l++;
					c = 0;
					break;
				case 'f':{
					StringBuilder str = str_array.get(l);
					if(c != str.length()){
						// 行末じゃないとき
						c++;
					}else if(l != str_array.size() -1){
						// 行末だけど最終行じゃないとき
						l++;
						c = 0;
					}
					break;
				}
				case 'b':
					if(c != 0){
						// 行頭じゃないとき
						c--;
					}else if(l != 0){
						// 行頭だけど上に行があるとき
						l--;
						c = str_array.get(l).length();
					}
					break;
				case 'd':{
					StringBuilder str = str_array.get(l);
					if(c < str.length()){
						// 行末じゃないとき
						str.deleteCharAt(c);
					}else if(l < str_array.size() - 1){
						StringBuilder str2 = str_array.get(l+1);
						str.append(str2);
						str_array.remove(str2);
					}
					break;
				}
				case 'k':{
					StringBuilder str = str_array.get(l);
					if(c < str.length()){
						// 行末じゃないとき
						buffer = str.substring(c);
						str.delete(c, str.length());
					}else if(l < str_array.size() - 1){
						StringBuilder str2 = str_array.get(l+1);
						str.append(str2);
						str_array.remove(str2);
						buffer = "\n";
					}
					break;
				}
				case 'y':{
					StringBuilder str = str_array.get(l);
					if(buffer.equals("\n")){
						String temp = str.substring(c);
						str.delete(c, str.length());
						StringBuilder str2 = new StringBuilder(temp);
						str_array.add(l+1, str2);
						l++;
						c = 0;
					}else{
						str.insert(c, buffer);
						c += buffer.length();
					}
					break;
				}
				case '-':
					print(str_array);
					flag = false;
					break;
				}
				// System.out.println("(" + l + ", " + c + ")");
				// print(str_array);
				// System.out.println("Buffer:" + buffer);
			}
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static void print(int a[]){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	static void print(int m[][]){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void print(ArrayList<StringBuilder> array){
		for(int i = 0; i < array.size(); i++){
			System.out.println(array.get(i));
		}
	}
}