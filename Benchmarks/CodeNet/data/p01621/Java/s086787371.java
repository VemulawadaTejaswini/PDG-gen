import java.util.*;

public class Main {
	static boolean[] list;
	static HashMap<String,Integer> daylist;
	static ArrayList<String> name;
	static ArrayList<Integer> listlist=new ArrayList<Integer>();
	static ArrayList<Integer> listlist2=new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			int t = sc.nextInt();
			String week = sc.next();
			String time = sc.next();
			int p = sc.nextInt();
			int m = sc.nextInt();

			list=new boolean[7*24*60+1];
			
			for(int e=0;e<list.length;e++)list[e]=false;
			
			daylist=new HashMap<String,Integer>();
			name=new ArrayList<String>();
			name.add("Sun");
			daylist.put(name.get(0), 0);
			
			name.add("Mon");
			daylist.put(name.get(1), 1*24*60);
			
			name.add("Tue");
			daylist.put(name.get(2), 2*24*60);
		
			name.add("Wed");
			daylist.put(name.get(3), 3*24*60);
			
			name.add("Thu");
			daylist.put(name.get(4), 4*24*60);
			
			name.add("Fri");
			daylist.put(name.get(5), 5*24*60);
			
			name.add("Sat");
			daylist.put(name.get(6), 6*24*60);		
			
			if (s == 0 && n == 0 && t == 0 && p == 0 && m == 0 && week.equals("None") && time.equals("None"))break;		
			
			
			
			
			if(week.equals("All")){
			//	for(int i=0;i<name.size();i++){
					set(time);
			//	}
			}else {
				set(week,time);
			}
			if(list[0]||list[10080]){
				list[0]=true;
				list[10080]=true;
			}
			int aroundable=0;
			/*
			System.out.print(list[0]==true?"T":"F");
			for(int u=1;u<list.length;u++){
				System.out.print(list[u]==true?"T":"F");
				if(u%1440==0)System.out.println();
				if(u%360==0)System.out.println();
			}
		*/
			int ii=0;
			while(true){
				int count=0;
				
				int here=ii;
//				int sub=i+s;
				listlist=new ArrayList<Integer>();
				

				for(int j=0;j<m;j++){
					int sub=here+s;
			//		if(sub>10080)sub-=10080;
					if(list[here]&&check(here,sub)){
						count++;
						listlist.add(here);
					}
					here+=t;
					if(here>=10080)here-=10080;
				}
				
				
			//	System.out.println(list[i]);
		//		if(list[i]&&list[i+s]){
	
				/*
				int sub=i+s;
				if(sub>=7*24*60)sub-=7*24*60;
				if(list[i]&&list[sub]&&check(i,sub))count++;
					int here=i+t;
					listlist=new ArrayList<Integer>();
					for(int j=1;j<m;j++){
						if(here>=7*24*60)here-=7*24*60;
						sub=here+s;
						if(sub>=7*24*60)sub-=7*24*60;
						if(list[here]&&list[sub]&&check(here,here+s)){
							listlist.add(here);
							count++;
						}
						here+=t;
					}
					
					*/
			//		System.out.println(count);

					
					//aroundable=Math.max(aroundable, count);
			if(aroundable<count){
				listlist2=new ArrayList<Integer>();
				for(int j=0;j<listlist.size();j++)listlist2.add(listlist.get(j));
				aroundable=count;
			}
					
					
					//		System.out.println(aroundable);
			//	}
				
				ii++;
				if(ii==7*24*60)break;
			}

	//		System.out.println(p+" "+n);
			double result=1.0-(1.0/p);
			result=result==0?result=1:result;
		//	System.out.println(result);
			
			
			
		//	System.out.println(aroundable);
			result=1-Math.pow(result,aroundable*n);
			result=result==0&&!(time.equals("Night")&&s>=360)?result=1:result;
	//		System.out.println(result);
			
			System.out.printf("%.10f\n",result);
	
		//	for(int j=0;j<listlist2.size();j++)System.out.println(listlist2.get(j));
			/*		
	 
			System.out.print(list[0]==true?"T":"F");
			for(int u=1;u<list.length;u++){
				System.out.print(list[u]==true?"T":"F");
				if(u%1440==0)System.out.println();
				if(u%360==0)System.out.println();
			}
			
			*/
		}
	}
	
	public static void set(String str){
		if(str.equals("Day")){
			for(int i=0;i<daylist.size();i++)setset(daylist.get(name.get(i)),6,18);
		}
		else if(str.equals("Night")){
			for(int i=0;i<daylist.size();i++){
				setset(daylist.get(name.get(i)),0,6);
				setset(daylist.get(name.get(i)),18,24);
			}
		}else for(int i=0;i<daylist.size();i++)setset(daylist.get(name.get(i)),0,24);
		
	}
	public static void set(String strw,String strt){
//		System.out.println(strw+" "+strt);
		if(strt.equals("Day"))setset(daylist.get(strw),6,18);
		else if(strt.equals("Night")){

			setset(daylist.get(strw),0,6);
			setset(daylist.get(strw),18,24);
		}else setset(daylist.get(strw),0,24);
	}
	public static void setset(int num,int start,int end){
		//int sa=end-start;
		
		if(start==0&&end==24){
			start=num;
			end=start+1440;
		}else if(start==0&&end==6){
			start=num;
			end=start+360;
		}else if(start==18&&end==24){
			start=num+1080;
			end=start+360;
		}else if(start==6&&end==18){
			start=num+360;
			end=start+720;
		}
		
		for(int i=start;i<end;i++)list[i]=true;			
		
		
		/*
		if(num==-1){

			int start2=start*60;
			int end2=sa*60+start2;
			for(int j=start2;j<end2;j++){
			//	System.out.println(j);
				list[j]=true;
			}
			
			
		
			if(start==0)start=24;			
			for(int i=1;i<daylist.size();i++){			
				start2=i*start*60;
				end2=sa*60+start2;
				for(int j=start2;j<end2;j++){
			//		System.out.println(j);
					list[j]=true;
				}
				
			}
		}else {
			
			start=num+start*60;
			end=sa*60+start;
		
			for(int i=start;i<end;i++)list[i]=true;

		}
		*/
		
	}
	public static boolean check(int start,int end){
	//	if(start==10080)start=0;
		
		if(end<=10080){
			for(int i=start;i<=end;i++){
				if(!list[i])return false;
			}
	
		}else {
			end-=10080;
			for(int i=start;i<=10080;i++){
				if(!list[i])return false;
			}for(int i=0;i<=end;i++){
				if(!list[i])return false;
			}
	
		}
		
		return true;
	}
}