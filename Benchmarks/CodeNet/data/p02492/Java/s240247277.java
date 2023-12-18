public class Main{
	public static void main(String[] args){
		
		int a[],b[],c[];/*??°???*/
		a=new int[1000];
		b=new int[1000];
		c=new int[1000];
		
		String n[];/*?????????*/
		n=new String[1000];
		
		for(int i=1;i<1000;i++){
		try {
			a[i] = Integer.parseInt(args[i]);
			b[i] = Integer.parseInt(args[i+2]);
		}catch(NumberFormatException e){
			n[i] =args[i+1];
			i+=1;
		}
		}
		for(int i=1;1<1000;i++){
			if(n[i].equals("+")){
				c[i]=a[i]+b[i];
			}else if(n[i].equals("-")){
				c[i]=a[i]-b[i];
			}else if(n[i].equals("*")){
				c[i]=a[i]*b[i];
			}else if(n[i].equals("/")){
				c[i]=a[i]/b[i];
			}
			if(n[i]=="?") System.exit(0);
			System.out.println(c);
		}
		}
			
		}