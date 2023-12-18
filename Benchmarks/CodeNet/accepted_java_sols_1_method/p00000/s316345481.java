class Main{
	public static void main(String[] a)throws Exception{
		for(java.lang.reflect.Method m:new java.lang.reflect.Method[]{
				java.io.PrintStream.class.getMethod("println",String.class)
		}){
			for(int i:new int[]{1}) {
				for(int x:new int[9]){
					for(int j : new int[]{1}){
						for(int y:new int[9]){
							if(m.invoke(System.out,""+i+"x"+j+"="+i*j)==null){}
							if(++j==0){}
						}
					}
					if(++i==0){}
				}
			}
		}
	}
}