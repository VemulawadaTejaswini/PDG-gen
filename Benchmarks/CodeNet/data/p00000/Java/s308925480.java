package Experiment_1;

public class MatrixMultiplyThread extends Thread{
	private int R,C,Mod,Result;
	public boolean finish;
	public MatrixMultiplyThread() {
		super();
		finish = false;
	}
	public MatrixMultiplyThread(int r, int c, int mod) {
		super();
		R = r;
		C = c;
		Mod = mod;
		finish = false;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		finish = false;
		Result = 0;
		for (int i=0;i<MatrixMultiplyMain.M;++i)
			Result = (Result + MatrixMultiplyResourse.A.mat[R][i] * MatrixMultiplyResourse.A.mat[i][C]) % Mod;
		finish = true;
		MatrixMultiplyResourse.Sum++;
	}
	public int getResult() {
		return Result;
	}
}