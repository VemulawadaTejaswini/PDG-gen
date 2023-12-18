import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */
//ITP1_11???DICE2
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();  //?????????????????? ??????????????????
        String str;
        int N = Integer.parseInt(br.readLine());
        String[] A;
        String[] top = new String[24];
        
        for(int i=0;i<N;i++){
            saikoro2 d = new saikoro2(str1);
            str = br.readLine(); 
            A = str.split(" "); //??????A???1~6
            
            d.toTop( A[0]); 
            d.SideRoll( A[1] );
            top[i] = d.getS(2);
        }
        for(int i = 0;i<N;i++){
            System.out.println(top[i]);
        }
        
        
    }
}

class saikoro{
    String a[]; //???????????????????????¨???
    String b[]; //??????????????????????????¨???
    String tmp;
    
    
    
    saikoro(String a){
        this.a = new String[6];
        this.a = a.split(" ");   //java p486?????§
        this.b = new String[6];
        this.b[0]="1"; this.b[1]="2"; this.b[2]="3"; 
        this.b[3]="4"; this.b[4]="5"; this.b[5]="6";
    }
    
    void N(){
        tmp = this.a[0];
        this.a[0] = this.a[1]; this.a[1] = this.a[5]; 
        this.a[5] = this.a[4]; this.a[4] = tmp; 
        tmp = this.b[0];
        this.b[0] = this.b[1]; this.b[1] = this.b[5]; 
        this.b[5] = this.b[4]; this.b[4] = tmp; 
    }
    void S(){
        tmp = this.a[0];
        this.a[0] = this.a[4]; this.a[4] = this.a[5]; 
        this.a[5] = this.a[1]; this.a[1] = tmp; 
        tmp = this.b[0];
        this.b[0] = this.b[4]; this.b[4] = this.b[5]; 
        this.b[5] = this.b[1]; this.b[1] = tmp; 
    }
    void W(){
        tmp = this.a[0];
        this.a[0] = this.a[2]; this.a[2] = this.a[5];
        this.a[5] = this.a[3];  this.a[3] = tmp;
        tmp = this.b[0];
        this.b[0] = this.b[2]; this.b[2] = this.b[5];
        this.b[5] = this.b[3];  this.b[3] = tmp;
    }
    void E(){
        tmp = this.a[0];
        this.a[0] = this.a[3];  this.a[3] = this.a[5];
        this.a[5] = this.a[2];  this.a[2] = tmp;
        tmp = this.b[0];
        this.b[0] = this.b[3];  this.b[3] = this.b[5];
        this.b[5] = this.b[2];  this.b[2] = tmp;
    }
    
    //?????´?????????????????¢
    void SideMove(){
        tmp = this.a[1];
        this.a[1] = this.a[2];  this.a[2] = this.a[4];
        this.a[4] = this.a[3];  this.a[3] = tmp;
        tmp = this.b[1];
        this.b[1] = this.b[2];  this.b[2] = this.b[4];
        this.b[4] = this.b[3];  this.b[3] = tmp;
    }
    
    public String getS(int n){
        return this.a[n];
    }
    
}

class saikoro2 extends saikoro{
    static String TOP = "1";
    static String FRONT = "2";
    static String RIGHT = "3";
    static String LEFT = "4";
    static String BACK = "5";
    static String BOTTOM = "6";
    
    
    saikoro2(String x){
        super(x);
        this.TOP = super.a[0]; this.FRONT = super.a[1]; this.RIGHT = super.a[2];
        this.LEFT = super.a[3]; this.BACK = super.a[4]; this.BOTTOM = super.a[5];
    }
    
    
    // ??????????????????????????¢???TOP(????????????)???
    public void toTop(String s){
        if(s.equals(this.TOP)){
            
        }else if(s.equals(this.FRONT)){
            super.N();
        }else if(s.equals(this.RIGHT)){
            super.W();
        }else if(s.equals(this.LEFT)){
            super.E();
        }else if(s.equals(this.BACK)){
            super.S();
        }else if(s.equals(this.BOTTOM)){
            super.N(); super.N();
        }
    }
    //?????????????????¢???FRONT(2?????????)???
    public void SideRoll(String s){
        if(s.equals(this.TOP)){
            
        }else if( s.equals(this.FRONT) ){
            super.SideMove();
        }else if( s.equals(this.BACK) ){
            super.SideMove(); super.SideMove(); 
        }else if( s.equals(this.LEFT)){
            super.SideMove(); super.SideMove(); super.SideMove();
        }
    }
    
}