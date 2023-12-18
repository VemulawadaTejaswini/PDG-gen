
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		int counta=0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<String> ast = new ArrayList<String>();
		
		
		String[] sprite;
		
		
		double tmp1,tmp2;
		double[] tmper = new double[8];
		boolean flag;
		
		double tmpkata=0,tmpx,tmpy;
		double tmpkata2=0,tmpx2,tmpy2;
		int uuuuu;
		int ban =0;
		int yokosen,bangou,atari,dansuu;
		int yokosen2,bangou2,atari2,dansuu2;
		
		
		boolean flagr = false;
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			if(tmp.equals("")){
				break;
			}
			
			String[] sprit = tmp.split(" ");
			seihoukei sk1 = new seihoukei();
			seihoukei sk2 = new seihoukei();
			
			sk1.setXleft(Double.parseDouble(sprit[0]));
			sk1.setYleft(Double.parseDouble(sprit[1]));
			sk1.setXright(Double.parseDouble(sprit[2]));
			sk1.setYright(Double.parseDouble(sprit[3]));
			
			sk2.setXleft(Double.parseDouble(sprit[4]));
			sk2.setYleft(Double.parseDouble(sprit[5]));
			sk2.setXright(Double.parseDouble(sprit[6]));
			sk2.setYright(Double.parseDouble(sprit[7]));
			
			sk1.calc();
			sk2.calc();
			
			if(sk1.getXleft() >= sk2.getXleft() && sk1.getYleft() <= sk2.getYleft() ){
				flagr = true;
			}else if(sk1.getXleft2() <= sk2.getXleft2() && sk1.getYleft2() <= sk2.getYleft2() ){
				flagr = true;
			}else if(sk1.getXright() <= sk2.getXright() && sk1.getYright() >= sk2.getYright()){
				flagr = true;
			}else if(sk1.getXright2() >= sk2.getXright2() && sk1.getYright2() >= sk2.getYright2()){
				flagr = true;
			}
			
			if(flagr){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		
	}
}
class seihoukei{
	private double xleft;
	private double xright;
	private double yleft;
	private double yright;
	
	private double xleft2;
	private double xright2;
	private double yleft2;
	private double yright2;
	
	public double getXleft() {
		return xleft;
	}
	public void setXleft(double xleft) {
		this.xleft = xleft;
	}
	public double getXright() {
		return xright;
	}
	public void setXright(double xright) {
		this.xright = xright;
	}
	public double getYleft() {
		return yleft;
	}
	public void setYleft(double yleft) {
		this.yleft = yleft;
	}
	public double getYright() {
		return yright;
	}
	public void setYright(double yright) {
		this.yright = yright;
	}
	
	public double getXleft2() {
		return xleft2;
	}
	public double getXright2() {
		return xright2;
	}
	public double getYleft2() {
		return yleft2;
	}
	public double getYright2() {
		return yright2;
	}
	
	
	public void calc(){
		xleft2= xright;
		yleft2= yleft;
		
		xright2= xleft;
		yright2= yright;
		
	}
}