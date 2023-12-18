import java.io.*;;
 
class Main{
    public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;++i){
			if (Character.isUpperCase(ch[i])){
				ch[i]=Character.toLowerCase(ch[i]);
			}else{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(new String(ch));
    }
}