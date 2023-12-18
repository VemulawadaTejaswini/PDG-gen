import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

  public static void main(String[] args){

    BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
    String str="";
    StringTokenizer stk;
    int hirosi_i,hirosi_y;
    int kenjir_i,kenjir_y;
    int iwana_P,yamame_P,iwana10_B,yamame20_B;
    int sc_h,sc_k;

    try{
      str=bfr.readLine();
      if(str=="") {
        System.exit(0);
      }
      stk=new StringTokenizer(str," ");
      hirosi_i=Integer.parseInt(stk.nextToken());
      hirosi_y=Integer.parseInt(stk.nextToken());

      str=bfr.readLine();
      if(str=="") {
        System.exit(0);
      }
      stk=new StringTokenizer(str," ");
      kenjir_i=Integer.parseInt(stk.nextToken());
      kenjir_y=Integer.parseInt(stk.nextToken());

      str=bfr.readLine();
      if(str=="") {
        System.exit(0);
      }
      stk=new StringTokenizer(str," ");
      iwana_P=Integer.parseInt(stk.nextToken());
      yamame_P=Integer.parseInt(stk.nextToken());
      iwana10_B=Integer.parseInt(stk.nextToken());
      yamame20_B=Integer.parseInt(stk.nextToken());

      sc_h=iwana_P*hirosi_i+(hirosi_i/10)*iwana10_B+yamame_P*hirosi_y+(hirosi_y/20)*yamame20_B;
      sc_k=iwana_P*kenjir_i+(kenjir_i/10)*iwana10_B+yamame_P*kenjir_y+(kenjir_y/20)*yamame20_B;

      if(sc_k>sc_h) {
    	  System.out.println("kenjiro");
      }

      else if(sc_k<sc_h) {
    	  System.out.println("hiroshi");
      }

      else if(sc_k==sc_h) {
    	  System.out.println("even");
      }

    } catch (IOException e) {
      System.exit(0);
    }
    catch(NumberFormatException e) {
      System.exit(0);
    }

    catch(NullPointerException e) {
      System.exit(0);
    }
  }
}
