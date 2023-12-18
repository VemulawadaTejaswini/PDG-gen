import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int w;
		int todayfee;
		try{
			while((s=r.readLine())!=null){
				w=Integer.parseInt(s);
				if(w==-1){
					break;
				}
				if(w<=10){
					todayfee=1150;
				}else if(w>10 &&w<=20){
							todayfee=1150+125*(w-10);
						}else if(w>20 &&w<=30){
							todayfee=1150+125*10+140*(w-20);
								}else{
									todayfee=1150+1250+1400+160*(w-30);
				}
				System.out.println(4280-todayfee);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}