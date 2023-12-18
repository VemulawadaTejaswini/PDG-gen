public class weight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=32;
		System.out.println("Input:"+input);
		System.out.print("Output:");
		System.out.println(weight(input));
	}
	public static String weight(int num){		//num=蛟、縲〔=菫よ焚
		int number=num;
		String sub="";		//途中経過
		String result="";	//結果
		int k=0;
		
		while(number>1){
			//int ans=number%2;
			//System.out.println("number="+number);
			int ans=(number%2);
			sub=ans+","+sub;
			number=number/2;
			k++;
		}
		sub=number+","+sub;
		//System.out.println("sub:"+sub);
		String[] div_sub=sub.split(",");
		for(int i=0;i<div_sub.length;i++){
			int x=(int)Math.pow((double)2,(double)(k-i));
			int ans=x*Integer.parseInt(div_sub[i]);
			//System.out.println("ans("+(k-i)+","+x+")="+ans);
			if(ans!=0){
				if(!result.equals(""))result=ans+" "+result;
				else result=""+ans;	
			}
		}
		return result;
	}
}