import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */
//ITP1_11???DICE2
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();  //?????????????????? ??????????????????
        saikoro2 d = new saikoro2(str);
        int N = Integer.parseInt(br.readLine());
        String[] A;
        String[] top = new String[24];
        
        for(int i=0;i<N;i++){
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
    static final String TOP = "1";
    static final String FRONT = "2";
    static final String RIGHT = "3";
    static final String LEFT = "4";
    static final String BACK = "5";
    static final String BOTTOM = "6";
    
    
    saikoro2(String x){
        super(x);
    }
    
    
    // ??????????????????????????¢???TOP(????????????)???
    public void toTop(String s){
        switch(s){
            case TOP:
                break;
            case FRONT:
                super.N();
                break;
            case RIGHT:
                super.W();
                break;
            case LEFT:
                super.E();
                break;
            case BACK:
                super.S();
                break;
            case BOTTOM:
                super.N(); super.N();
                break;
                
                
        }
    }
    //?????????????????¢???FRONT(2?????????)???
    public void SideRoll(String s){
        if(s == super.b[1]){
        }else if(s == super.b[2]){
            super.SideMove();
        }else if(s == super.b[4]){
            super.SideMove(); super.SideMove(); 
        }else if(s == super.b[3]){
            super.SideMove(); super.SideMove(); super.SideMove();
        }
    }
    
}