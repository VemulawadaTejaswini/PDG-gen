import java.io.*;
class Main{
    public static void main (String[] args)
   	throws IOException{
	int[] data=new int[10];
	int max1,max2,max3;
       BufferedReader br=
	   new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<10;i++){
	    String buf=br.readLine();
	    data[i]=Integer.parseInt(buf);
	}
	int min;
	for(int i=0;i<10;i++){
	    if(i==0)min=data[i];
	    if(max1>data[i]){
		min=data[i];
	    }
	}
	max2=max3=min;
	boolean check1=true,check2=true;
	for(int i=0;i<10;i++){
	    if(i==0)max1=data[i];
	    if(max1<data[i]){
		max1=data[i];
	    }
	}
	boolean check=true;
	for(int i=0;i<10;i++){
	    if(max1==data[i])continue;
	    if(check){
		check=false;
		max2=data[i];
	    }else if(max2<data[i]){
		max2=data[i];
	    }
	}
	check=true;
	for(int i=0;i<10;i++){
	    if(max2<=data[i])continue;
	    if(check){
		check=false;
		max3=data[i];
	    }else if(max3<data[i]){
		max3=data[i];
	    }
	}

	System.out.println(max1);
	System.out.println(max2);
	System.out.println(max3);
	
    }
}
	    