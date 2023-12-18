public class Main{
	public static void main(String[] args){
		try{
			int num=0;
			while(true){
				int c=System.in.read();
				if(c!=-1){
					if('0'<=c&&c<='9'){
						num=num*10+(c-'0');
					}else{
						break;
					}
				}else{
					break;
				}
			}
			num=(int)Math.pow(num,3);
			System.out.println(num);
		}
		catch(Throwable e){
			System.out.println("Input Error");
		}
	}
}