import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

class Main{

  public static void main(String[] args){

    BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
    String str="";
    StringTokenizer stk;
    int number;
    double omosa,takasa;
    List<Integer> himan=new ArrayList<Integer>();

    try{

      while(true) {
    	  System.out.println("cntn");
    	  str=bfr.readLine();
    	  str=str.replace(","," ");

    	  stk=new StringTokenizer(str," ");
          number=Integer.parseInt(stk.nextToken());
          omosa=Double.parseDouble(stk.nextToken());
          takasa=Double.parseDouble(stk.nextToken());

          double bmi=((double)omosa)/((double)(takasa*takasa));

          if(bmi>25) {
        	  himan.add(number);
          }
          else {}
          System.out.println("wnd");
      }

    }catch (IOException e) {
    	for(Integer a:himan) {
    		System.out.println(a);
    	}
        System.exit(0);
      }
      catch(NumberFormatException e) {
    	  for(Integer a:himan) {
      		System.out.println(a);
      	}
        System.exit(0);
      }

      catch(NullPointerException e) {
    	  for(Integer a:himan) {
      		System.out.println(a);
      	}
        System.exit(0);
      }

    catch(NoSuchElementException e) {

    	for(Integer a:himan) {
    		System.out.println(a);
    	}
      System.exit(0);
    }
  }
}
