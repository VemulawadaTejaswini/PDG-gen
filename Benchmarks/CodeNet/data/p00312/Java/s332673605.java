import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

  public static void main(String[] args){

    BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
    String str="";
    StringTokenizer stk;
    int DIST,M_JUMP;

    try{
      str=bfr.readLine();
      if(str=="") {
        System.exit(0);
      }
      stk=new StringTokenizer(str," ");
      DIST=Integer.parseInt(stk.nextToken());
      M_JUMP=Integer.parseInt(stk.nextToken());
      int d_jk=DIST/M_JUMP;
      int kaisu=d_jk+((DIST-(M_JUMP*d_jk))/1);
      System.out.println(kaisu);


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
