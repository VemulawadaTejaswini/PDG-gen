class Main {
    public static void main(String[] args) {
        try {
        	Scanner scan = new Scanner(System.in);
        	String str1 = scan.next();
        	String str2 = scan.next();
        	if(Integer.parseInt(str1)>10000 || Integer.parseInt(str2)>10000)
        	{
        		System.out.println("??°??????100000????????§??\?????????????????????");
        	}
        	System.out.println(getGreatest(str1,str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 
   private static int getGreatest(String a,String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int min_num = Math.min(num1, num2);
        for(int d = min_num; d>0; d--)
        {
             if(num1%d==0 && num2%d==0)
             {
            	 return d;
             }
   
        }
       return 0; 
        
       }
}