import java.util.*;
class Main{
	static int t[];
	static int T[];
	static int mult;
	static String now;
	static boolean isnum(char c){
		if(c>='0'&&c<='9')return true;
		return false;
	}
	static boolean islower(char c){
		if(c>='a'&&c<='z')return true;
		return false;
	}
	static boolean isupper(char c){
		if(c>='A'&&c<='Z')return true;
		return false;
	}
	static void solve(int a,int b){//[a,b)
		for(int i=a;i<b;i++){
			if(isupper(now.charAt(i))){
				if(i<b-1&&islower(now.charAt(i+1))){
					if(i<b-2&&isnum(now.charAt(i+2))){
						if(i<b-3&&isnum(now.charAt(i+3))){
							if(i<b-4&&isnum(now.charAt(i+4))){
								if(i<b-5&&isnum(now.charAt(i+5))){
									if(i<b-6&&isnum(now.charAt(i+6))){
										t[now.charAt(i)*256+now.charAt(i+1)]+=mult*((int)(now.charAt(i+2)-'0')*10000+(int)(now.charAt(i+3)-'0')*1000+(int)(now.charAt(i+4)-'0')*100+(int)(now.charAt(i+5)-'0')*10+(int)(now.charAt(i+6)-'0'));
										i+=6;
									}else{
										t[now.charAt(i)*256+now.charAt(i+1)]+=mult*((int)(now.charAt(i+2)-'0')*1000+(int)(now.charAt(i+3)-'0')*100+(int)(now.charAt(i+4)-'0')*10+(int)(now.charAt(i+5)-'0'));
										i+=5;
									}
								}else{
									t[now.charAt(i)*256+now.charAt(i+1)]+=mult*((int)(now.charAt(i+2)-'0')*100+(int)(now.charAt(i+3)-'0')*10+(int)(now.charAt(i+4)-'0'));
									i+=4;
								}
							}else{
								t[now.charAt(i)*256+now.charAt(i+1)]+=mult*((int)(now.charAt(i+2)-'0')*10+(int)(now.charAt(i+3)-'0'));
								i+=3;
							}
						}else{
							t[now.charAt(i)*256+now.charAt(i+1)]+=mult*(int)(now.charAt(i+2)-'0');
							i+=2;
						}
					}else{
						t[now.charAt(i)*256+now.charAt(i+1)]+=mult;
						i++;
					}
				}else{
					if(i<b-1&&isnum(now.charAt(i+1))){
						if(i<b-2&&isnum(now.charAt(i+2))){
							if(i<b-3&&isnum(now.charAt(i+3))){
								if(i<b-4&&isnum(now.charAt(i+4))){
									if(i<b-5&&isnum(now.charAt(i+5))){
										t[now.charAt(i)*256]+=mult*((int)(now.charAt(i+1)-'0')*10000+(int)(now.charAt(i+2)-'0')*1000+(int)(now.charAt(i+3)-'0')*100+(int)(now.charAt(i+4)-'0')*10+(int)(now.charAt(i+5)-'0'));
										i+=5;
									}else{
										t[now.charAt(i)*256]+=mult*((int)(now.charAt(i+1)-'0')*1000+(int)(now.charAt(i+2)-'0')*100+(int)(now.charAt(i+3)-'0')*10+(int)(now.charAt(i+4)-'0'));
										i+=4;
									}
								}else{
									t[now.charAt(i)*256]+=mult*((int)(now.charAt(i+1)-'0')*100+(int)(now.charAt(i+2)-'0')*10+(int)(now.charAt(i+3)-'0'));
									i+=3;
								}
							}else{
								t[now.charAt(i)*256]+=mult*((int)(now.charAt(i+1)-'0')*10+(int)(now.charAt(i+2)-'0'));
								i+=2;
							}
						}else{
							t[now.charAt(i)*256]+=mult*(int)(now.charAt(i+1)-'0');
							i++;
						}
					}else{
						t[now.charAt(i)*256]+=mult;
					}
				}
			}else if(now.charAt(i)=='('){
				int count=1;
				for(int j=i+1;;j++){
					if(now.charAt(j)=='(')count++;
					if(now.charAt(j)==')')count--;
					if(count==0){
						if(j<b-1&&isnum(now.charAt(j+1))){
							if(j<b-2&&isnum(now.charAt(j+2))){
								if(j<b-3&&isnum(now.charAt(j+3))){
									if(j<b-4&&isnum(now.charAt(j+4))){
										if(j<b-5&&isnum(now.charAt(j+5))){
											mult*=((int)(now.charAt(j+1)-'0')*10000+(int)(now.charAt(j+2)-'0')*1000+(int)(now.charAt(j+3)-'0')*100+(int)(now.charAt(j+4)-'0')*10+(int)(now.charAt(j+5)-'0'));
											solve(i+1,j);
											mult/=((int)(now.charAt(j+1)-'0')*10000+(int)(now.charAt(j+2)-'0')*1000+(int)(now.charAt(j+3)-'0')*100+(int)(now.charAt(j+4)-'0')*10+(int)(now.charAt(j+5)-'0'));
											i=j+5;
										}else{
											mult*=((int)(now.charAt(j+1)-'0')*1000+(int)(now.charAt(j+2)-'0')*100+(int)(now.charAt(j+3)-'0')*10+(int)(now.charAt(j+4)-'0'));
											solve(i+1,j);
											mult/=((int)(now.charAt(j+1)-'0')*1000+(int)(now.charAt(j+2)-'0')*100+(int)(now.charAt(j+3)-'0')*10+(int)(now.charAt(j+4)-'0'));
											i=j+4;
										}
									}else{
										mult*=((int)(now.charAt(j+1)-'0')*100+(int)(now.charAt(j+2)-'0')*10+(int)(now.charAt(j+3)-'0'));
										solve(i+1,j);
										mult/=((int)(now.charAt(j+1)-'0')*100+(int)(now.charAt(j+2)-'0')*10+(int)(now.charAt(j+3)-'0'));
										i=j+3;
									}
								}else{
									mult*=((int)(now.charAt(j+1)-'0')*10+(int)(now.charAt(j+2)-'0'));
									solve(i+1,j);
									mult/=((int)(now.charAt(j+1)-'0')*10+(int)(now.charAt(j+2)-'0'));
									i=j+2;
								}
							}else{
								mult*=(int)(now.charAt(j+1)-'0');
								solve(i+1,j);
								mult/=(int)(now.charAt(j+1)-'0');
								i=j+1;
							}
						}else{
							solve(i+1,j);
							i=j;
						}
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		t=new int[65536];
		T=new int[65536];
		while(true){
			String mole=s.next();
			if(mole.equals("END_OF_FIRST_PART"))break;
			int p=s.nextInt();
			if(mole.length()==1){
				T[(int)(mole.charAt(0))*256]=p;
			}else T[(int)(mole.charAt(0))*256+(int)(mole.charAt(1))]=p;
		}
		String[] val;
		while(true){
			String next=s.next();
			if(next.equals("0"))System.exit(0);
			val=next.split("\\+");
			for(int i=0;i<65536;i++)t[i]=0;
			for(int i=0;i<val.length;i++){
				int q=val[i].length();
				now=val[i];
				mult=1;
				if(q>0&&isnum(val[i].charAt(0))){
					if(q>1&&isnum(val[i].charAt(1))){
						if(q>2&&isnum(val[i].charAt(2))){
							if(q>3&&isnum(val[i].charAt(3))){
								if(q>4&&isnum(val[i].charAt(4))){
									mult=(int)(val[i].charAt(0)-'0')*10000+(int)(val[i].charAt(1)-'0')*1000+(int)(val[i].charAt(2)-'0')*100+(int)(val[i].charAt(3)-'0')*10+(int)(val[i].charAt(4)-'0');
									solve(5,val[i].length());
								}else{
									mult=(int)(val[i].charAt(0)-'0')*1000+(int)(val[i].charAt(1)-'0')*100+(int)(val[i].charAt(2)-'0')*10+(int)(val[i].charAt(3)-'0');
									solve(4,val[i].length());
								}
							}else{
								mult=(int)(val[i].charAt(0)-'0')*100+(int)(val[i].charAt(1)-'0')*10+(int)(val[i].charAt(2)-'0');
								solve(3,val[i].length());
							}
						}else{
							mult=(int)(val[i].charAt(0)-'0')*10+(int)(val[i].charAt(1)-'0');
							solve(2,val[i].length());
						}
					}else{
						mult=(int)(val[i].charAt(0)-'0');
						solve(1,val[i].length());
					}
				}else solve(0,val[i].length());
			}
			int ret=0;
			boolean ok=true;
			for(int i=0;i<65536;i++){
				if(t[i]>0&&T[i]==0)ok=false;
				else ret+=T[i]*t[i];
		//		if(T[i]>0)System.out.println(""+(char)(i/256)+(char)(i%256)+":"+t[i]);
			}
			if(ok)System.out.println(ret);
			else System.out.println("UNKNOWN");
		}
	}
}