import java.util.*;

class Main{

    public static void main(String[] args){
	int a,b,c,n;
	int[] ina = new int[500];
	int[] inb = new int[500];
	int[] inc = new int[500];
	int[] num = new int[500];
	int[] tof = new int[500];  
	Scanner in = new Scanner(System.in);
	while(true)
	    {
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
	
		Arrays.fill(num,-1);
		if(a == 0 && c == 0 && b == 0)break;
		n = in.nextInt();
		for(int i=1;i<=n;i++)
		    {
			ina[i] = in.nextInt();
			inb[i] = in.nextInt();
			inc[i] = in.nextInt();
			tof[i] = in.nextInt();
			if(tof[i] == 1)
			    {
				num[ina[i]] = 1;
				num[inb[i]] = 1;
				num[inc[i]] = 1;
			    }
		    }
		for(int i=1;i<=n;i++)
		    {
			if(tof[i] == 1)continue;
			if(num[ina[i]] == 1 && num[inb[i]] == 1)
			    {
				num[inc[i]] = 0;
			    }
			else if(num[ina[i]] == 1 && num[inc[i]] == 1)
			    {
				num[inb[i]] = 0;
			    }
			else if(num[inb[i]] == 1 && num[inc[i]] == 1)
			    {
				num[ina[i]] = 0;
			    }
			//	System.out.println("DE num[" + ina[i]  + "] = " + num[ina[i]] + ", num[" + inb[i] + "] = " + num[inb[i]] + ", num[" + inc[i] + "] = " + num[inc[i]]);
		    }

		for(int i=1;i<=a+b+c;i++)
		    {
			if(num[i] == -1)System.out.println("2");
			else System.out.println(num[i]);
		    }


	    }


    }


}