
public class Main {
    public static void main(int[] a){
        try{
//            String sub = "";
        	int sub = 0;
            for(int k=0;k<a.length-1;k++){
                 for (int i = k+1; i < a.length; i++) {
//                    int num1 = Long.parseInt(a[k]);
//                    int num2 = Long.parseint(a[i]);
                	 int num1 = a[k];
                	 int num2 = a[i];
                    if (num1<num2) {
                        sub = a[i];
                        a[i]=a[k];
                        a[k] = sub;
                    }
                }
            }
        }catch(Exception e){
        }
        for (int i = 0; i < 3; i++) {
//            String string = a[i];
        	int string = a[i];
            System.out.println(string);
        }
    }
}