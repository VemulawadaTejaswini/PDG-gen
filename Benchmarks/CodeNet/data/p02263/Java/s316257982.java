import java.io.*;

class Main
{

    public static void main(String args[])
    {
	try
	    {
		int stack[]=new int[100];
		int j=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		String[] processed = str.split(" ",0);
		//for(int i= 0 ; i <processed.length ; i++)System.out.println(processed[i]);
		for(int i= 0 ; i <processed.length ; i++)
		    {
			if(processed[i].equals("+"))//equals("")はダブルクオーテーション" "の見た目と変数.equals(" ")の変数の中身が一致すればtrue、一致しなければfalse。半角全角とかが違っても見た目同じならtrue。
			    {
				//System.out.println("test");
				//System.out.println(stack[j-1]+" "+stack[j]);
				stack[j-2] = stack[j-2]+stack[j-1];
				/*System.out.println(stack[j]);
				System.out.println(stack[j-1]);
				System.out.println(stack[j+1]);*/
				j--;
			    }
			else if(processed[i].equals("-"))
			    {
				
				stack[j-2] = stack[j-2]-stack[j-1];
				j--;
			    }
			else if(processed[i].equals("*"))
			    {
				stack[j-2] = stack[j-2] * stack[j-1];
				j--;
			    }
			else if(processed[i].equals("/"))
			    {
				stack[j-2] = stack[j-2]/stack[j-1];
				j--;
			    }
			else
			    {
				stack[j] = Integer.parseInt(processed[i]);
				//System.out.println("stack["+j+"]="+stack[j]);
				j++;
				//for(int k = 0 ; k < j ; k++)System.out.println("stack["+k+"]="+stack[k]);
				//System.out.println("j = "+j);
				//System.out.println("");
			    }
		    }
		//for(int i = 0 ; i< processed.length ; i++)System.out.print(processed[i]+" ");

		//for(int k = 0 ; k < j ; k++)System.out.println("stack["+k+"]="+stack[k]);
		System.out.println(stack[0]);
		    
	    }
	catch(IOException e)
	    {
		System.out.println(e);
	    }
    }
    
}

